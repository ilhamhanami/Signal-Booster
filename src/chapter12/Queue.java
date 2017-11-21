/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

public interface Queue
{
   public boolean isEmpty();
   public Object getFrontElement();
   public Object getRearElement();
   public void put(Object theObject);
   public Object remove();
}
