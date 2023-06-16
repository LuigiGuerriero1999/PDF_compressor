module com.luigiguerriero.pdf_compressor {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.luigiguerriero.pdf_compressor to javafx.fxml;
    exports com.luigiguerriero.pdf_compressor;
}