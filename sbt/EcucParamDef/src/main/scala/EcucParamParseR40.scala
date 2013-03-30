package main.scala


import scala.xml.XML
import scala.xml.Node

import scalax.file.Path
import scalax.io.Resource

/** */
class EcucParamParseR40(res:Path) {
	val resource =res

	def parseParamDef(elem:Node):Unit={
		for (bs <- elem \\ "ECUC-MODULE-DEF" ){
			for( <SHORT-NAME>{h}</SHORT-NAME> <- bs.child  ){
				parseModule(bs,0)
			}
		}
	}
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
              case <SHORT-NAME>{name}</SHORT-NAME> => {param.name=name.text;println(name)}
              case <DESC>{ u @ _* }</DESC> => { param.desc=bs.text}
              case <LOWER-MULTIPLICITY>{lower}</LOWER-MULTIPLICITY> => {param.lower=lower.text}
              case <UPPER-MULTIPLICITY>{upper}</UPPER-MULTIPLICITY> => {param.upper = upper.text }
              case <PARAMETERS>{parameters @ _*}</PARAMETERS> => {
//        			param.paramType=elem.label
			        param.dump(depth,resource)
					parameters foreach{parameter=>parseParameters(parameter,depth)}
					//parameters foreach{parameter=>parseParameters(parameter,depth+1)}
					}
              case <REFERENCES>{references @ _*}</REFERENCES> => {
//      			param.paramType=elem.label
			        param.dump(depth,resource)
					references foreach{reference => parseReferences(reference,depth)}
					//references foreach{reference => parseReferences(reference,depth+1)}
					}
              case <CHOICES>{choices @ _*}</CHOICES>=>{ 
//        			param.paramType=elem.label
			        param.dump(depth,resource)
					choices foreach { container => parseContainer(container,depth+1)} 
					}
              case <SUB-CONTAINERS>{subcontainers @ _*}</SUB-CONTAINERS>=>{ 
//        			param.paramType=elem.label
			        param.dump(depth,resource)
					subcontainers foreach { container => parseContainer(container,depth+1)} 
					}
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

