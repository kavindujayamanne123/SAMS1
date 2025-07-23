package com.ijse.sams.sams.Controller;

import com.ijse.sams.sams.dto.CourseDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CourseInformationController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("CourseInformationController");

        colCourseID.setCellValueFactory(new PropertyValueFactory<>("courseID"));
        colName.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        colDesc.setCellValueFactory(new PropertyValueFactory<>("courseDescription"));
        colLect.setCellValueFactory(new PropertyValueFactory<>("Lecturer"));
        colDuration.setCellValueFactory(new PropertyValueFactory<>("courseDuration"));
        colCrsFee.setCellValueFactory(new PropertyValueFactory<>("courseFee"));
        colMinQul.setCellValueFactory(new PropertyValueFactory<>("courseMinQualification"));

    }

    public AnchorPane ancCourseInformation;
    public TableView<CourseDto> tblCourseInformation;
    public TableColumn<CourseDto,String> colCourseID;
    public TableColumn<CourseDto,String> colName;
    public TableColumn<CourseDto,String> colDesc;
    public TableColumn<CourseDto,String> colLect;
    public TableColumn<CourseDto,String> colDuration;
    public TableColumn<CourseDto,String> colCrsFee;
    public TableColumn<CourseDto,String> colMinQul;

    public void goBackCourseManagement(ActionEvent actionEvent) throws IOException {
        ancCourseInformation.getChildren().clear();
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/com/ijse/sams/sams/views/Course.fxml"));
        ancCourseInformation.getChildren().add(anchorPane);
    }
}
