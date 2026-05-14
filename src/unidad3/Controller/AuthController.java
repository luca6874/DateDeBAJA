package unidad3.Controller;

import unidad3.View.AuthViews;

public class AuthController {

    private AuthViews vista;

    public AuthController(){
        vista = new AuthViews();
    }
    
    public void dasclogin(){
        vista.dasclogin();
    }
}