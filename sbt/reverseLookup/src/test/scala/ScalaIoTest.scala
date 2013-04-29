package test.scala

import org.junit._
import Assert._
import main.scala._

class ScalaIoTest {
	@Test
	def testFilePath(){
		import scalax.file.Path
		val filePath = Path("hoge.txt")
		filePath.delete()
		val dirPath=Path("foo")
		dirPath.deleteRecursively()
	}
}

