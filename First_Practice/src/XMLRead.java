import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XMLRead {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException, java.io.IOException {
		
		File fXmlFile = new File("F:\\ReadXML.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
		Document doc = dbBuilder.parse(fXmlFile);
		// doc.getDocumentElement().normalize();
		System.out.println("Root Element: " + doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("staff");
		for(int temp = 0; temp < nList.getLength(); temp++)
		{
			Node nNode = nList.item(temp);
			System.out.println("\nCurrent Element: " + nNode.getNodeName());
			Element eElement = (Element) nNode;
			System.out.println("Staff ID: " + eElement.getAttribute("id"));
			System.out.println("First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
			System.out.println("Last Name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
			System.out.println("nickname: " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
			System.out.println("salary: " + eElement.getElementsByTagName("salary").item(0).getTextContent());
			
		}
				
		

	}

}
