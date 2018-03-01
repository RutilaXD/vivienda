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

/**
 *
 * @author Raul
 */
public class Pago {
    private float monto;
    private String mesCobro;
    private String mesPago;
    private String formaPago;
    private boolean pagado;

    /**
     *
     * @param monto
     * @param mesCobro
     * @param mesPago
     * @param formaPago
     * @param pagado
     */
    public Pago(float monto, String mesCobro, String mesPago, String formaPago, boolean pagado) {
        this.monto = monto;
        this.mesCobro = mesCobro;
        this.mesPago = mesPago;
        this.formaPago = formaPago;
        this.pagado = pagado;
    }

    /**
     * @return the monto
     */
    public float getMonto() {
        return monto;
    }

    /**
     * @return the mesCobro
     */
    public String getMesCobro() {
        return mesCobro;
    }

    /**
     * @return the mesPago
     */
    public String getMesPago() {
        return mesPago;
    }

    /**
     * @return the formaPago
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * @return the pagado
     */
    public boolean isPagado() {
        return pagado;
    }
    
    
}
