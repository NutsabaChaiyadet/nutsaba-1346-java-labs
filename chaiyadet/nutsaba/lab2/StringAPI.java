/*program check university or college or neither a university nor a college
 *
 *  Author: Nutsaba Chaiyadet
* ID: 653040134-6
* Sec: 1
* Date: December 9, 2022
*/

package chaiyadet.nutsaba.lab2;

public class StringAPI {
    public static void main(String[] args) {
        String name1 = args[0];
        String n = name1.toLowerCase();
        if (n.contains("university")) {
            System.out.println(name1 + " is a university");
        }
        else if (n.contains("college")){
            System.out.println(name1 + " is a college");
        }
        else {
            System.out.println(name1 + " is neither a university nor a college");
        }
            
    }
}
