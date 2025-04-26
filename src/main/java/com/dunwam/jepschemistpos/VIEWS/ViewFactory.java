package com.dunwam.jepschemistpos.VIEWS;

import com.dunwam.jepschemistpos.ENUMS.DashboardOptions;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class ViewFactory {
    private static final Logger log = (Logger) LoggerFactory.getLogger(ViewFactory.class);
    //initializing the object property and Panes
    private final ObjectProperty dashboardSelectedItem;
    private AnchorPane homeAnchorPane, salesAnchorPane, todoAnchorPane, reportsAnchorPane, settingsAnchorPane, stockAnchorPane, servicesAnchorPane,
            helpAnchorPane,notificationAnchorPane;

    //Constructor
    public ViewFactory(){this.dashboardSelectedItem = new SimpleObjectProperty();    }

    //DASHBOARD SECTION
    public <DashboardOptions> ObjectProperty<DashboardOptions> getDashboardSelectedItem(){return dashboardSelectedItem; }

    //Getting the dashboard Resources
    public AnchorPane getHomeAnchorPane(){
        if (homeAnchorPane== null){
            try {
                homeAnchorPane = new FXMLLoader(getClass().getResource("/FXML/home.fxml")).load();
            }catch (Exception e){log.error("Error Loading the homeAnchorPane{}",e.getMessage());
                e.printStackTrace();
        }
    }
        return homeAnchorPane;
    }























