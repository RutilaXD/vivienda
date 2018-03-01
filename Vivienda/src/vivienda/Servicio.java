/*
 * Copyright (C) 2018 Raul
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package vivienda;

import java.util.Date;

/**
 *
 * @author Raul
 */
public class Servicio {
    private String servicio;
    private float montoPago;
    private Date fechaPago;
    private int mes1;
    private int mes2;
    private boolean pagado;

    public Servicio(String servicio, float montoPago, Date fechaPago) {
        this.servicio = servicio;
        this.montoPago = montoPago;
        this.fechaPago = fechaPago;
        
        if(this.fechaPago.getMonth() == 2){
            mes1 = 12; mes2 = 1;
        }else if(this.fechaPago.getMonth() == 1){
            mes1 = 11; mes2 = 12;
        }else{
            mes1 = this.fechaPago.getMonth() - 2;
            mes2 = this.fechaPago.getMonth() - 1;
        }
        this.pagado = true;
    }

    /**
     * @return the servicio
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * @return the montoPago
     */
    public float getMontoPago() {
        return montoPago;
    }

    /**
     * @return the fechaPago
     */
    public Date getFechaPago() {
        return fechaPago;
    }

    /**
     * @return the mes1
     */
    public int getMes1() {
        return mes1;
    }

    /**
     * @return the mes2
     */
    public int getMes2() {
        return mes2;
    }

    /**
     * @return the pagado
     */
    public boolean isPagado() {
        return pagado;
    }
    
}
