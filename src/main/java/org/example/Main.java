package org.example;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private final static File FILE_PATH = new File("src/main/resources/AS_ADDR_OBJ.XML");

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВведите дату начала действия адреса в формате yyyy-mm-dd");
            String date = scanner.nextLine();

            System.out.println("\nВведите идентификаторы через пробел");
            String strIds = scanner.nextLine();
            List<String> ids = List.of(strIds.split(" "));

            printAddressByDate(date, ids);

            System.out.println("\nЧтобы завершить введите \"0\", чтобы продолжить \"Enter\"");
            String exit = scanner.nextLine();
            if (exit.equals("0")) {
                break;
            }
        }
    }

    public static void printAddressByDate(String date, List<String> ids) throws IOException {

        XmlMapper xmlMapper = new XmlMapper();
        AddressObjects addressObjects = xmlMapper.readValue(FILE_PATH, AddressObjects.class);

        List<Object> foundAddresses = addressObjects.getObject().stream()
                .filter(o -> o.getStartDate().equals(date))
                .filter(o -> ids.contains(o.getId()))
                .collect(Collectors.toList());

        if (foundAddresses.isEmpty()) {
            System.out.println("\nПо вашему запросу ничего не найдено");
        } else {
            foundAddresses.forEach(o -> System.out.println(o.getId() + ": " + o.getTypeName() + " " + o.getName()));
        }
    }
}