import com.aspose.pdf.Document;
import com.aspose.pdf.License;
import com.aspose.pdf.TextAbsorber;
import com.aspose.pdf.TextExtractionOptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ConvertPdfToTextInJava {
    public static void main(String[] args) throws Exception { // main method to convert a PDF document to Text file
        // Instantiate the license to avoid trial limitations while converting the PDF to a text file
        License asposePdfLicenseText = new License();
        asposePdfLicenseText.setLicense("Aspose.pdf.lic");

        // Load the source PDF file that is to be converted to Text file
        Document convertPDFDocumentToText = new Document("input.pdf");

        // Instantiate a TextAbsorber class object for converting PDF to Text
        TextAbsorber textAbsorber = new TextAbsorber(new TextExtractionOptions(TextExtractionOptions.TextFormattingMode.Pure));

        // Call the Accept method exposed by the TextAbsorber class
        convertPDFDocumentToText.getPages().accept(textAbsorber);

        // Read the text as string
        String ExtractedText = textAbsorber.getText();

        // Create the BufferedWriter object to open the file
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("SampleOutput.txt")));

        // Write extracted contents to the file
        writer.write(ExtractedText);

        // Close writer
        writer.close();

        System.out.println("Done");
    }
}