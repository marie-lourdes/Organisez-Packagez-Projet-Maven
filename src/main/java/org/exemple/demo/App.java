package org.exemple.demo;

import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");
		Properties vProp = new Properties();
		InputStream vInputStream = null;

		try {
			// getResourceAsStream, methode des type class
			vInputStream = App.class.getResourceAsStream("info.properties");
			// load() methode de la classe Properties, qui une liste de proprité dans un
			// inputStream
			vProp.load(vInputStream);
			System.out.println(" propriété de version de l application defini dans info.properties: "
					+ vProp.getProperty(org.exemple.demo.version, "?"));
			// on recupere la propriété crée dans info.properties , dont la valeur est passé
			// dans le second parametre avec "?"
		} finally {

		}
	}
}
