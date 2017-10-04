package com.example.jdonado1.tallerzapato;

import android.view.View;

/**
 * Created by jdonado1 on 03/10/2017.
 */

public class Metodo {

    public static double sumar(double n1, double n2){
        return n1 + n2;
    }

    public static double restar(double n1, double n2){
        return n1-n2;
    }

    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    public static double dividir (double n1, double n2){
        return n1/n2;
    }

    public void Cotizar (View v){

        int OpcionGenero, OpcionTipoZapatilla, OpcionMarca, Cantidad;
        double ValorUni, ValorCant;

        OpcionGenero = Genero.getSelectedItemPosition();
        OpcionTipoZapatilla = TipoZapatilla.getSelectedItemPosition();
        OpcionMarca = Marca.getSelectedItemPosition();


        if (Validacion()){
            Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
            if (Cantidad != 0){
                if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 0){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 120000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }

                if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 1){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 140000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }

                if (OpcionGenero == 0 && OpcionTipoZapatilla == 0 && OpcionMarca == 2){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 130000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }

                if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 50000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }
                if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 1){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 80000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }
                if (OpcionGenero == 0 && OpcionTipoZapatilla == 1 && OpcionMarca == 2){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 100000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }

                if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 0){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 100000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }
                if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 1){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 130000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }

                if (OpcionGenero == 1 && OpcionTipoZapatilla == 0 && OpcionMarca == 2){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 110000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }

                if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 60000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }
                if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 0){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 60000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }
                if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 1){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 70000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }
                if (OpcionGenero == 1 && OpcionTipoZapatilla == 1 && OpcionMarca == 2){
                    Cantidad = Integer.parseInt(TxtCantidad.getText().toString());
                    ValorUni = 120000;
                    ValorCant = Cantidad * ValorUni;

                    ValorUnitario.setText(""+ValorUni);
                    ValorCantidad.setText(""+ValorCant);
                }
            }else{
                TxtCantidad.setError(resources.getString(R.string.Error_dos));
            }




        }

    }




}
