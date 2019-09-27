/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testKnightDistance;

import misc.KnightDistance;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author black
 */
public class testKnightDistance {
    
    @Test
    public void Test1(){
        KnightDistance p = new KnightDistance();
        assertEquals(p.dist(1,3,2,3), 3);
    }
    
    @Test
    public void Test2(){
        KnightDistance p = new KnightDistance();
        assertEquals(p.dist(1,2,1,3), 3);
    }
    
    @Test
    public void Test3(){
        KnightDistance p = new KnightDistance();
        assertEquals(p.dist(1,2,1,7), 2);
    }
    
    @Test
    public void Test4(){
        KnightDistance p = new KnightDistance();
        assertEquals(p.dist(1,3,3,5), 4);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
