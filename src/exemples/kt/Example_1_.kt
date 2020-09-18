package exemples

import java.io.File

fun main(args: Array<String>) {
	val f = File(".");
	println("Llista de fitxers i diretoris del directori actual");
	println("-----------------------------------------------------------------")
	for(e in f.list().sorted())
		println(e);
}