package Funciones;
import java.lang.annotation.ElementType;
import java.sql.ResultSet;

/**
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageType;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import com.itextpdf.layout.properties.VerticalAlignment;
import com.itextpdf.io.image.ImageDataFactory;;
 */
public class FPdf {
    private ResultSet DatosEmpleadoNombre;
    private ResultSet DatosEmpleadoRL;
    private ResultSet DatosTrabajo;

    public FPdf(ResultSet _DatosEmpleadoNombre, ResultSet _DatosEmpleadoRL, ResultSet _DatosTrabajo){
        this.DatosEmpleadoNombre = _DatosEmpleadoNombre;
        this.DatosEmpleadoRL = _DatosEmpleadoRL;
        this.DatosTrabajo = _DatosTrabajo;
    }

    public FPdf(){
        
    }
    public void generar(){
        String dest = "hello_word.pdf";
        try {
            /**
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf, PageSize.A4.rotate());
            ImageData imageData = ImageDataFactory.create("src\\Images\\logo_pp.png");
            Image image = new Image(imageData);
            image.scaleToFit(100, 100);
            int red = 0xD6;
            int green = 0x0B;
            int blue = 0x13;
            DeviceRgb backgroundColor = new DeviceRgb(red, green, blue);


            float[] columnWidths = {280f, 30f, 30f}; // Porcentajes de ancho de cada columna
            Table Header = new Table(columnWidths);
            Header.setWidth(UnitValue.createPercentValue(100));
            Header.setBorder(Border.NO_BORDER);
            Cell EmptyCell = new Cell().add(new Paragraph(""));
            Header.addCell(EmptyCell);
            EmptyCell.setBorder(Border.NO_BORDER);
            Cell textHeader = new Cell().add(new Paragraph("BOLETA DE PAGO"));
            textHeader.setTextAlignment(TextAlignment.CENTER);
            textHeader.setVerticalAlignment(VerticalAlignment.MIDDLE);
            textHeader.setBorder(Border.NO_BORDER);
            Header.addCell(textHeader);

            Cell ImageHeader = new Cell().add(image);
            ImageHeader.setBorder(Border.NO_BORDER);
            ImageHeader.setTextAlignment(TextAlignment.CENTER);
            Header.addCell(ImageHeader);

            document.add(Header);

            document.add(new Paragraph("DATOS DE LA EMPRESA"));
            Table TEmpresa = new Table(4);
            TEmpresa.setWidth(UnitValue.createPercentValue(100));

            String[] DTEmpresa = {"RUC", "RUBRO EMPRESA", "RAZON SOCIAL", "DIRECCION", "20275532496", "PETROLIO", "Petróleos del Perú, PETROPERÚ S.A", "Au. Panamericana Nte. 1354"};

            for(int i = 0; i < DTEmpresa.length; i++){
                Cell HEmpresa = new Cell().add(new Paragraph(DTEmpresa[i]));
                HEmpresa.setTextAlignment(TextAlignment.CENTER);
                HEmpresa.setVerticalAlignment(VerticalAlignment.MIDDLE);
                if(i < 4){
                    HEmpresa.setBackgroundColor(backgroundColor);
                }
                TEmpresa.addCell(HEmpresa);
            }
            document.add(TEmpresa);

            document.add(new Paragraph("DATOS DEL TRABJADOR"));

            Table TDTrabajador = new Table(7);
            TDTrabajador.setWidth(UnitValue.createPercentValue(100));

            String[] DTrabajor = {"CODIGO", "APELLIDOS Y NOMBRE", "DNI", "F-NACIMIENTO", "HIJOS", "DIRRECION", 
            "TURNO", "1123", "PEREZ PEPITO", "70236703", "06-2-14", "SI", "CALLE LAS HUERTAS #143", "TARDE"};

            for(int i = 0; i < DTrabajor.length; i++){
                Cell HTrabajador = new Cell().add(new Paragraph(DTrabajor[i]));
                HTrabajador.setTextAlignment(TextAlignment.CENTER);
                HTrabajador.setVerticalAlignment(VerticalAlignment.MIDDLE);
                if(i < 7){
                    HTrabajador.setBackgroundColor(backgroundColor);
                }
                TDTrabajador.addCell(HTrabajador);
            }
            document.add(TDTrabajador);


            document.add(new Paragraph("DATOS DEL TRABAJDOR VINCULADOS A LA RELACION LABORAL"));

            Table TDatos = new Table(7);
            TDatos.setWidth(UnitValue.createPercentValue(100));
            
            String[] TDVR = {
                "Cargo", "Periodo", "ONP", "AFP", "F.ING", "F.CESE", "TURNO",
                "Recursos Humanos", "MENSUAL", "", "INTEGRA", "1/02/2018", "1/02/28", "TARDE"
            };

            for(int i = 0; i < TDVR.length; i++){
                Cell HDTVR = new Cell().add(new Paragraph(TDVR[i]));
                HDTVR.setTextAlignment(TextAlignment.CENTER);
                HDTVR.setVerticalAlignment(VerticalAlignment.MIDDLE);
                if(i < 7){
                    HDTVR.setBackgroundColor(backgroundColor);
                }
                TDatos.addCell(HDTVR);
            }

            document.add(TDatos);

            document.add(new Paragraph(""));
            Table TODtos = new Table(5);
            TODtos.setWidth(UnitValue.createPercentValue(100));

            String[] TOD = {
                "DIAS LABORADOS", "TOTAL DE HORAS", "DIAS NO LABORADOS", "CTA AHORRO DEPOSITO", "CTA AFP",
                "30", "240", "0", "4280797712844236", "4280795329545329" 
            };

            for(int i = 0; i < TOD.length; i++){
                Cell HTOD = new Cell().add(new Paragraph(TOD[i]));
                HTOD.setTextAlignment(TextAlignment.CENTER);
                HTOD.setVerticalAlignment(VerticalAlignment.MIDDLE);
                if(i < 5){
                    HTOD.setBackgroundColor(backgroundColor);
                }
                TODtos.addCell(HTOD);
            }

            document.add(TODtos);



            document.close();
            System.out.println("Se creo");
            *  */
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
