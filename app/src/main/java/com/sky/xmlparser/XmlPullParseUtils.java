package com.sky.xmlparser;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class XmlPullParseUtils {

    private static List<Student> listStudent;
    private static Student student;

    public static Student getUpdateInfo(String xmlMsg) {
        Student infoStudent = new Student();
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = factory.newPullParser();
            parser.setInput(new StringReader(xmlMsg));

            int eventType = parser.getEventType();

            while (eventType != XmlPullParser.END_DOCUMENT) {
                switch (eventType) {
                    case XmlPullParser.START_TAG:
                        if (parser.getName().equals("Students")) {
                            List<Student> listStudent = new ArrayList<Student>();
                        }

                        if (parser.getName().equals("Student")) {
                            Student student = new Student();
                            student.setNumber(parser.getAttributeName(0));
                        }

                        if (parser.getName().equals("name")) {
                            student.setName(parser.nextText());

                        } else if (parser.getName().equals("age")) {
                            student.setAge(Integer.parseInt(parser.nextText()));
                        } else if (parser.getName().equals("sex")) {
                            student.setSex(parser.nextText());
                        } else if (parser.getName().equals("score")) {
                            student.setScore(Double.parseDouble(parser.nextText()));
                        }

                        break;
                    case XmlPullParser.END_TAG:
                        if (parser.getName().equals("student")) {
                            listStudent.add(student);

                        }
                        break;

                    default:
                        break;
                }
                parser.next();

                eventType = parser.getEventType();
            }

        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return infoStudent;
    }

}
