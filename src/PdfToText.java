
//import org.apache.pdfbox.*;
//import org.apache.pdfbox.pdmodel.*;
//import org.apache.pdfbox.rendering.PDFRenderer;
//import org.apache.pdfbox.text.PDFTextStripper;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class PdfToText {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(21);
        list.add(3);
        list.add(45);
        list.add(78);
        list.add(45);
        list.add(3);
        list.stream()
        //.map(list::length)
        .peek(s->System.out.print(s+"-"))
        .map(n-> n+100 )
        .forEach(s->System.out.print(s+" "));

    }
}
