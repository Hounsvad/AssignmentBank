/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService.Acquaintance;

/**
 *
 * @author Jeppe Enevold
 */
public interface ILink {

    public void injectLogic(ILogic LogicLayer);

    void startConnection();
}
