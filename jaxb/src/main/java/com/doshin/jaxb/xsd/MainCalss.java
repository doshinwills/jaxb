package com.doshin.jaxb.xsd;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.doshin.beans.Customer;
import com.doshin.beans.PurchaseOrder;

public class MainCalss {

	public static void main(String[] args) {
		try {
			/* init very simple data to marshal */
			PurchaseOrder po = new PurchaseOrder();
			Customer amazon = new Customer();
			amazon.setName("Spain");
			amazon.setAddress("762 blue sage dr");
			po.setCustomer(amazon);

			/* init jaxb marshaler */
			JAXBContext jaxbContext = JAXBContext.newInstance(PurchaseOrder.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			/* set this flag to true to format the output */
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			/*
			 * marshaling of java objects in xml (output to file and standard
			 * output)
			 */
			jaxbMarshaller.marshal(po, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
