/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.exception;

/**
 *
 * @author G0042204
 */
public class CustomerNotFound extends Exception {

    public CustomerNotFound() {
        super("Cliente não encontrado.");
    }

}
