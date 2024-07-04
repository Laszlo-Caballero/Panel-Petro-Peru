package Funciones;
import java.lang.annotation.ElementType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageType;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Tab;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import com.itextpdf.layout.properties.VerticalAlignment;

import Database.Crud;

import com.itextpdf.io.image.ImageDataFactory;;

public class FPdf {
    private List<String>  DatosTrabajador = new ArrayList<String>();
    private List<String> DatosRelacionLaboral = new ArrayList<String>();
    private List<String> Fechas = new ArrayList<String>();
    private List<String> Bonificaciones = new ArrayList<String>();
    private List<String> Descuentos = new ArrayList<String>();
    private String Dni;
    private int salario;
    private int red = 0xD6;
    private int green = 0x0B;
    private int blue = 0x13;
    private DeviceRgb backgroundColor = new DeviceRgb(red, green, blue);
    private Crud crud = new Crud();

    public FPdf(String dni){
        Dni = dni;
        LocalDate today = LocalDate.now();
        LocalDate primerDiaMesActual = today.withDayOfMonth(1); 
        LocalDate ultimoDiaMesAnterior = primerDiaMesActual.minusDays(1); 
        String[] parametro = {dni};
        String[] parametros = {dni, "2020-03-01", "2020-01-30"};
        try {
            ResultSet RDatosTrabajador = crud.SelectCondition("exec ObtenerDatosEmpleado @Dni=?", parametro); 
            ResultSet RDatosRelacionLaboral = crud.SelectCondition("exec DatosRelacionLaboral @Dni=?", parametro);
            ResultSet RFechas = crud.SelectCondition("exec ObtenerDiasLaborados @Dni=?, @FechaActual = ?, @FechaMesAnt = ?", parametros);
            ResultSet RBonificaciones = crud.SelectCondition("exec ObtenerBonificaciones @Dni=?", parametro);
            ResultSet RDescuentos = crud.SelectCondition("exec obtenerDescuentos @Dni=?", parametro);
            ResultSet salarioR = crud.SelectCondition("select C.Salario from Contrato AS C inner join Empleado as E on E.IdContrato = C.IdContrato where E.Dni = ?", parametro);
            while (salarioR.next()) {
                salario = Integer.parseInt(salarioR.getObject(1).toString());
            }
            DatosTrabajador = crud.ConvertResultSet(RDatosTrabajador);
            DatosRelacionLaboral = crud.ConvertResultSet(RDatosRelacionLaboral);
            Fechas = crud.ConvertResultSet(RFechas);
            Bonificaciones = crud.ConvertResultSet(RBonificaciones);
            Descuentos = crud.ConvertResultSet(RDescuentos);
            Bonificaciones.add("Salario Neto");
            Bonificaciones.add(String.valueOf(salario));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public void generar(){
        String dest = Dni + " " + LocalDate.now() +".pdf";
        try {
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf, PageSize.A4.rotate());
            ImageData imageData = ImageDataFactory.create("src\\Images\\logo_pp.png");
            Image image = new Image(imageData);
            image.scaleToFit(100, 100);
  


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

            String[] DatosEmpresa = {"RUC", "RUBRO EMPRESA", "RAZON SOCIAL", "DIRECCION"};
            String[] AuxDt = {"20275532496", "PETROLIO", "Petróleos del Perú, PETROPERÚ S.A", "Au. Panamericana Nte. 1354"};
            List<String> LDatosEmpresa = new ArrayList<String>();
            for (int i = 0; i<AuxDt.length; i++){
                LDatosEmpresa.add(AuxDt[i]);
            }
            SetData(DatosEmpresa, TEmpresa, 4, true);
            SetData(LDatosEmpresa, TEmpresa, -1, true);
            document.add(TEmpresa);

            document.add(new Paragraph("DATOS DEL TRABJADOR"));

            Table TDTrabajador = new Table(7);
            TDTrabajador.setWidth(UnitValue.createPercentValue(100));

            String[] DTrabajor = {"CODIGO", "APELLIDOS Y NOMBRE", "DNI", "F-NACIMIENTO", "HIJOS", "DIRRECION", "TURNO"};

            SetData(DTrabajor, TDTrabajador, 7, true);
            SetData(DatosTrabajador, TDTrabajador, -1, true);
            document.add(TDTrabajador);


            document.add(new Paragraph("DATOS DEL TRABAJDOR VINCULADOS A LA RELACION LABORAL"));

            Table TDatos = new Table(6);
            TDatos.setWidth(UnitValue.createPercentValue(100));
            
            String[] TDVR = {
                "Cargo", "Periodo", "ONP", "AFP", "F.ING", "F.CESE"
            };

            SetData(TDVR, TDatos, 6, true);
            SetData(DatosRelacionLaboral, TDatos, -1, true);
            document.add(TDatos);

            document.add(new Paragraph(""));
            Table TODtos = new Table(5);
            TODtos.setWidth(UnitValue.createPercentValue(100));

            String[] TOD = {
                "DIAS LABORADOS", "TOTAL DE HORAS", "DIAS NO LABORADOS", "CTA AHORRO DEPOSITO", "CTA AFP",
            };

            SetData(TOD, TODtos, 5, true);
            SetData(Fechas, TODtos, -1, true);

            document.add(TODtos);
            document.add(new Paragraph(""));
            Table RRA = new Table(3);
            RRA.setWidth(UnitValue.createPercentValue(100));
            String[] HeadersRRA = {"REMUNERACIONES", "RETENECIONES / DESCUENTOS", "APORTACIONES DEL EMPLEADOR"};
            
            SetData(HeadersRRA, RRA, 3, true);

            Table TRE = new Table(2);
            TRE.setBorder(Border.NO_BORDER);
            TRE.setWidth(UnitValue.createPercentValue(100));
            SetData(Bonificaciones, TRE, -1, false);

            RRA.addCell(TRE);

            Table TRD = new Table(3);
            TRD.setBorder(Border.NO_BORDER);
            TRD.setWidth(UnitValue.createPercentValue(100));
            SetData(Descuentos, TRD, -1, false);
            
            RRA.addCell(TRD);

            Table APE = new Table(2);
            APE.setWidth(UnitValue.createPercentValue(100));
            List<String> DAPE = new ArrayList<String>();
            DAPE.add("Essalud");
            DAPE.add("92.07");
            DAPE.add("S.C.T.R");
            DAPE.add("");
            SetData(DAPE, APE, -1, false);

            RRA.addCell(APE);
            
            Double DineroBonificaiones = CalcularDinero(Bonificaciones, 2);
            Double DineroDescuentos = CalcularDinero(Descuentos, 3);
            DecimalFormat df = new DecimalFormat("#.##");
            String[] Totales = {"Total Remuneraciones: " + String.valueOf(DineroBonificaiones), 
            "Total Descuentos: " + df.format(DineroDescuentos), "Neto a Pagar: " + String.valueOf(DineroBonificaiones + DineroDescuentos)};
            SetData(Totales, RRA, 4, true);

            document.add(RRA);

            document.add(new Paragraph("Paijan, Junio del 2024"));
            document.close();
            System.out.println("Se creo");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void SetData(String[]Data, Table tabla, int CantHeaders, Boolean border){
        for(int i = 0; i < Data.length; i++){
            Paragraph parrafo = new Paragraph(Data[i]);
            parrafo.setFontSize(8);
            parrafo.setFontColor(new DeviceRgb(255, 255, 255));
            Cell Cell = new Cell().add(parrafo);
            Cell.setTextAlignment(TextAlignment.CENTER);
            Cell.setVerticalAlignment(VerticalAlignment.MIDDLE);
            if(i < CantHeaders){
                Cell.setBackgroundColor(backgroundColor);
            }
            if (!border){
                Cell.setBorder(Border.NO_BORDER);
            }
            tabla.addCell(Cell);
        }
    }
    private void SetData(List<String>Data, Table tabla, int CantHeaders, Boolean border){
        for(int i = 0; i < Data.size(); i++){
            Paragraph parrafo = new Paragraph(Data.get(i));
            parrafo.setFontSize(8);
            Cell Cell = new Cell().add(parrafo);
            Cell.setTextAlignment(TextAlignment.CENTER);
            Cell.setVerticalAlignment(VerticalAlignment.MIDDLE);
            if(i < CantHeaders){
                Cell.setBackgroundColor(backgroundColor);
            }
            if (!border){
                Cell.setBorder(Border.NO_BORDER);
            }
            tabla.addCell(Cell);
        }
    }
    private Double CalcularDinero(List<String> data, int Columna){
        Double result = 0.0;
        for (int i = 0; i< data.size(); i++){
            Double numero = 0.0;
            try {
                numero = Double.parseDouble(data.get(i));
            } catch (NumberFormatException e) {
                numero = 0.0;
            } 
            result += numero;
        }
        return result;
    }
}
