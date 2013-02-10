package org.xtext.example.qdsl.generator

import org.xtext.example.qdsl.qDsl.Question

class GeneratorExtensions {
def String getType(Question q){
switch(q.answerTypes.atype){ case "radio_button":
getEnumName(q) case "check_box":
"Set<"+getEnumName(q)+">" default:
"String"
} }
def getEnumName(Question q){ q.name.toFirstUpper+"Kind"
}
def getEnumValueName(String s){
s.replaceAll("[ ,.]","_")
 }
 
 
 def modelForPackage(Question q){
 	q.eContainer
 }
 def wtype(Question q){ switch(q.answerTypes.atype){
case "radio_button": "radio"
case "check_box": "checkbox"
default : "textarea"
} }
}