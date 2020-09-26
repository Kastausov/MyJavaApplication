/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGenerics;

/**
 *
 * @author Dmitry
 */
public class GenStr<T extends String>{
    private T str;

    public GenStr(T str) {
        this.str = str;
    }

    public T getStr() {
        return str;
    }

    public void setStr(T str) {
        this.str = str;
    }
}
