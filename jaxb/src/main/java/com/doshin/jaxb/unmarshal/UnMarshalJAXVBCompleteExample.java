package com.doshin.jaxb.unmarshal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.doshin.jaxb.business.Countries;

public class UnMarshalJAXVBCompleteExample {
	public static void main(String[] args) {

		try {

			File file = new File("target/classes/countries.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Countries.class);

			/**
			 * the only difference with the marshaling operation is here
			 */
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Countries countres = (Countries) jaxbUnmarshaller.unmarshal(file);
			System.out.println(countres);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
