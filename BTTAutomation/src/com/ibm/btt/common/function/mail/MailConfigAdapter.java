package com.ibm.btt.common.function.mail;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.DOMReader;
import org.dom4j.io.SAXReader;
public class MailConfigAdapter {
	private Document doc;
	private SAXReader saxReader;
	private Element root;
	
	public MailConfigAdapter(){
		saxReader = new SAXReader();
		try {
			 doc = saxReader.read(new File("./src/MailConfig.xml"));
			 root = doc.getRootElement();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
			
	}
	/**
	 * 
	 * @return 从配置文件中获得SMTP地址
	 */
	public String getSMTPHomeName(){
		Element SMTPHomeName = root.element("MailService").element("SMTPHomeName");
		return SMTPHomeName.getText();
	}
	/**
	 * 
	 * @return 从配置文件中获得邮件的标题
	 */
	public String getSubject(){
		Element subject = root.element("MailService").element("Subject");
		return subject.getText();
	}
	/**
	 * 
	 * @return 从配置文件中获得所有测试人员的列表
	 */
	public String getAllTester(){
		List allTesterList= root.element("User").element("UserGroup").element("AllTester").elements();
		StringBuffer sb =new StringBuffer();
		for(Iterator iter = allTesterList.iterator(); iter.hasNext();){
			Element e = (Element)iter.next();
			
			System.out.println(e.getText());
			sb.append(e.getText()+",");
		}
		
		return sb.toString();
	}
	/**
	 * 
	 * @return 从配置文件中获得所有人员的列表
	 */
	public String getBTTAll(){
		List allTesterList= root.element("User").element("UserGroup").element("BTTAll").elements();
		StringBuffer sb =new StringBuffer();
		for(Iterator iter = allTesterList.iterator(); iter.hasNext();){
			Element e = (Element)iter.next();
			
			System.out.println(e.getText());
			sb.append(e.getText()+",");
		}
		
		return sb.toString();
	}
	public String getSendFrom(){
		Element sendFrom =  root.element("User").element("SendFrom");
		return sendFrom.getText();
	}
	
	
	public static void main(String[] args) throws Exception{
			SAXReader saxReader = new SAXReader();
			
			Document doc = saxReader.read(new File("./src/MailConfig.xml"));
			
			Element root = doc.getRootElement();
			
			System.out.println("root element: " + root.getName());
			
			List childList = root.elements();
			
			System.out.println(childList.size());
			
			MailConfigAdapter mca = new MailConfigAdapter();
			System.out.println(mca.getSMTPHomeName());
			System.out.println(mca.getSubject());
			System.out.println(mca.getAllTester());
			System.out.println(mca.getSendFrom());
			/*
			for(Iterator iter = root.elementIterator(); iter.hasNext();)
			{
				Element e = (Element)iter.next();
				
				System.out.println(e.attributeValue("age"));
			}
			
			System.out.println("---------------------------");
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			org.w3c.dom.Document document = db.parse(new File("student2.xml"));
			
			DOMReader domReader = new DOMReader();
			
			//将JAXP的Document转换为dom4j的Document
			Document d = domReader.read(document);
			
			Element rootElement = d.getRootElement();
			
			System.out.println(rootElement.getName());*/

	}

}
