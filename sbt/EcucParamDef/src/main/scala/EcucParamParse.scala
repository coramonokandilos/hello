package main.scala


import scala.xml.XML
import scala.xml.Node

import scalax.file.Path
import scalax.io.Resource

/** */
class EcucParamParse(res:Path) extends Application{
	val resource =res

    /** */
    def parseModule(elem:Node,depth:Int):Unit={
        var param = new Param()
        for( bs <- elem.child ){
            bs match{
              case <SHORT-NAME>{name}</SHORT-NAME> => {param.name=name.text}
              case <DESC>{ u @ _* }</DESC> => { param.desc=bs.text}
              case <LOWER-MULTIPLICITY>{lower}</LOWER-MULTIPLICITY> => {param.lower=lower.text}
              case <UPPER-MULTIPLICITY>{upper}</UPPER-MULTIPLICITY> => {param.upper=upper.text;
        			param.dump(depth,resource)
                    }
              case <CONTAINERS>{containers @ _*}</CONTAINERS> => { containers foreach{container => parseContainer(container,depth+1)}}
              case _  => {}
            }
        }
    }

	/** */
    def parseContainer(elem:Node,depth:Int):Unit={
        var param = new Param()
        for(bs <- elem.child){
            bs match{
              case <SHORT-NAME>{name}</SHORT-NAME> => {param.name=name.text}
              case <DESC>{ u @ _* }</DESC> => { param.desc=bs.text}
              case <LOWER-MULTIPLICITY>{lower}</LOWER-MULTIPLICITY> => {param.lower=lower.text}
              case <UPPER-MULTIPLICITY>{upper}</UPPER-MULTIPLICITY> => {param.upper = upper.text
        			param.dump(depth,resource)
                }
              case <PARAMETERS>{parameters @ _*}</PARAMETERS> => {parameters foreach{parameter=>parseParameters(parameter,depth+1)}}
              case <REFERENCES>{references @ _*}</REFERENCES> => {references foreach{reference => parseReferences(reference,depth+1)}}
              case <SUB-CONTAINERS>{subcontainers @ _*}</SUB-CONTAINERS>=>{ subcontainers foreach { container => parseContainer(container,depth+1)} }
              case _ => {}
            }
        }
    }

	/** */
    def parseReferences(elem:Node,depth:Int):Unit={
        var param = new Param()
        for(bs <- elem.child){
            bs match{
              case <SHORT-NAME>{name}</SHORT-NAME> => {param.name=name.text} 
              case <LOWER-MULTIPLICITY>{lower}</LOWER-MULTIPLICITY> => {param.lower=lower.text} 
              case <UPPER-MULTIPLICITY>{upper}</UPPER-MULTIPLICITY> => {param.upper=upper.text}
              case <DESC>{ u @ _* }</DESC> => { param.desc=bs.text}
              case <DESTINATION-REF>{dest}</DESTINATION-REF> => {param.refpath = dest.text}
              case _=>{}
            }
        }
        param.paramType=elem.label
        param.dump(depth,resource)
    }

    def parseParameters(elem:Node,depth:Int):Unit={
        var param = new Param()
        for(bs <- elem.child){
            bs match{
              case <SHORT-NAME>{name}</SHORT-NAME> => {param.name=name.text} 
              case <LOWER-MULTIPLICITY>{lower}</LOWER-MULTIPLICITY> => {param.lower=lower.text} 
              case <UPPER-MULTIPLICITY>{upper}</UPPER-MULTIPLICITY> => {param.upper=upper.text}
			  case <MAX>{max}</MAX> =>{param.maxValue = max.text}
			  case <MIN>{min}</MIN> =>{param.minValue = min.text}
			  case <LITERALS>{literals @ _*}</LITERALS> => { var enum="";literals foreach{literal=>{
				enum += (literal \\ "SHORT-NAME").text +" "
				}}
				param.inputRange = enum
				}
              case _ =>{}
            }
        }
/*
		elem match{
			case <ENUMERATION-PARAM-DEF>{enum @ _* }</ENUMERATION-PARAM-DEF>=>{
				println(elem \\ "LITERALS")
			}
		}
*/
        param.paramType=elem.label
        param.dump(depth,resource)
    }

}

class Param(){
    var name:String=""
    var paramType:String=""
    var lower:String=""
    var upper:String=""
    var refpath:String=""
    var desc:String=""
	var inputRange:String=""
	var origin:String=""
	var maxValue:String=""
	var minValue:String=""

    override def toString():String={
        name+":"+paramType+":"+lower+":"+upper+":"+refpath
    }

    def dump(depth:Int,res:Path):Unit={
        if(paramType!="#PCDATA"){
            if(paramType==""){
            //container
			desc = desc.replaceAll("(\r)+\n"," ")
			desc = desc.replaceAll("\n"," ")
			desc = desc.trim()
			val line = "\t"*depth+name+"\t"*(10-depth)+paramType+"\t"+lower+"\t"+upper+"\t"+refpath+desc.replaceAll("(\r)\n","")+"\t"+inputRange+"\t"+origin+"\n"
			res.append(line)
            }else{
                //parameter
			desc = desc.replaceAll("(\r)+\n"," ")
			desc = desc.replaceAll("\n"," ")
			desc = desc.trim()
			 val line = "\t"*(10-depth-2)+name+"\t"*(10-depth)+paramType+"\t"+lower+"\t"+upper+"\t"+refpath+desc.replaceAll("(\r)\n","")+"\t"+inputRange+"\t"+origin+"\n"
			res.append(line)
            }
//			println("["+desc)
        }
    }
}


