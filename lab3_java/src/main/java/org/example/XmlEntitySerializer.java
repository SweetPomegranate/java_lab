//package org.example;
//
//import jakarta.xml.bind.JAXBContext;
//import jakarta.xml.bind.JAXBException;
//import jakarta.xml.bind.Marshaller;
//import jakarta.xml.bind.Unmarshaller;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.StringReader;
//import java.io.StringWriter;
//
//public class XmlEntitySerializer<T> implements EntitySerializer<T> {
//    private final Class<T> type;
//
//    public XmlEntitySerializer(Class<T> type) {
//        this.type = type;
//    }
//
//    @Override
//    public String serialize(T entity) throws JAXBException {
//        JAXBContext context = JAXBContext.newInstance(type);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//
//        StringWriter writer = new StringWriter();
//        marshaller.marshal(entity, writer);
//        return writer.toString();
//    }
//
//    @Override
//    public T deserialize(String data) throws JAXBException {
//        JAXBContext context = JAXBContext.newInstance(type);
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        return (T) unmarshaller.unmarshal(new StringReader(data));
//    }
//
//    @Override
//    public void writeToFile(T entity, File file) throws JAXBException, IOException {
//        JAXBContext context = JAXBContext.newInstance(type);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        marshaller.marshal(entity, file);
//    }
//
//    @Override
//    public T readFromFile(File file) throws JAXBException, IOException {
//        JAXBContext context = JAXBContext.newInstance(type);
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        return (T) unmarshaller.unmarshal(file);
//    }
//}
