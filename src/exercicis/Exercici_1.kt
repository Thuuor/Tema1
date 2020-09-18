package exercicis

import java.io.File
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
	val f = File.listRoots()[0]
	
	val string = "Llista de fitxers i directoris del directori " + f
	println(string)
	println("-".repeat(string.length))
	
	println("Directori pare")
	var count = 1
	for (e in f.listFiles().sorted()) {
		if (e.isFile())
			println(e.getName() + "\t " + e.length())
		if (e.isDirectory())
			println(e.getName() + "\t <Directori>")
		count++
	}
	

}

