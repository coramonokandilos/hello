package test.scala

import org.junit._
import Assert._
import main.scala._

class SampleTest {
	@Test
	def sample(){
//		fail("hoge")
		assert(1==1,"false")
	}
	@Test 
	def testVelocitySample(){
		val sample = (new VelocitySample())
		sample.doSample
	}
	@Test 
	def testMergeTemplate(){
		val sample = new VelocitySample()
		val filepath="src/main/resources/order.vm"
		assertEquals("hogehoge kazuhiro shibuya\n",sample.mergeTemplate(filepath))
	}
}
