package main.scala


import scalax.file.Path
import scalax.io.Resource

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

	var isDumped = false
    override def toString():String={
        name+":"+paramType+":"+lower+":"+upper+":"+refpath
    }

    def dump(depth:Int,res:Path):Unit={
		if(isDumped){
			return
		}
        if(paramType!="#PCDATA"){
            if(paramType==""){
            //container
			desc = desc.replaceAll("(\r)+\n"," ")
			desc = desc.replaceAll("\n"," ")
			desc = desc.trim()
			val line = "\t"*depth+name+"\t"*(10-depth)+paramType+"\t"+lower+"\t"+upper+"\t"+inputRange+"\t"+refpath+desc.replaceAll("(\r)\n","")+"\t"+origin+"\n"
			res.append(line)
            }else{
                //parameter
			desc = desc.replaceAll("(\r)+\n"," ")
			desc = desc.replaceAll("\n"," ")
			desc = desc.trim()
			 val line = "\t"*8+name+"\t"*2+paramType+"\t"+lower+"\t"+upper+"\t"+inputRange+"\t"+refpath+desc.replaceAll("(\r)\n","")+"\t"+origin+"\n"
			 //val line = "\t"*(10-depth-2)+name+"\t"*(10-depth)+paramType+"\t"+lower+"\t"+upper+"\t"+refpath+desc.replaceAll("(\r)\n","")+"\t"+inputRange+"\t"+origin+"\n"
			res.append(line)
            }
//			println("["+desc)
        }
		isDumped = true
    }
}


