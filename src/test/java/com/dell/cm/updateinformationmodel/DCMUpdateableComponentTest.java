/* 
 * Copyright 2017 Dell Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dell.cm.updateinformationmodel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raveendra_Madala
 */
public class DCMUpdateableComponentTest {

    public DCMUpdateableComponentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class DCMUpdateableComponent.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        DCMUpdateableComponent instance = new DCMUpdateableComponent(DCMComponentType.DRIVER, "");
        DCMI18NString expResult = null;
        DCMI18NString result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setName method, of class DCMUpdateableComponent.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        DCMI18NString inName = null;
        DCMUpdateableComponent instance = new DCMUpdateableComponent(DCMComponentType.DRIVER, "");
        int expResult = 0;
        int result = instance.setName(inName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getTargetIdentifier method, of class DCMUpdateableComponent.
     */
    @Test
    public void testGetTargetIdentifier() {
        System.out.println("getTargetIdentifier");
        DCMUpdateableComponent instance = new DCMUpdateableComponent(DCMComponentType.DRIVER, "");
        String expResult = "";
        String result = instance.getTargetIdentifier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getComponentType method, of class DCMUpdateableComponent.
     */
    @Test
    public void testGetComponentType() {
        System.out.println("getComponentType");
        DCMUpdateableComponent instance = new DCMUpdateableComponent(DCMComponentType.DRIVER, "");
        DCMComponentType expResult = DCMComponentType.DRIVER;
        DCMComponentType result = instance.getComponentType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUniqueIdentifier method, of class DCMUpdateableComponent.
     */
    @Test
    public void testGetUniqueIdentifier() {
        System.out.println("getUniqueIdentifier");
        DCMUpdateableComponent instance = new DCMUpdateableComponent(DCMComponentType.DRIVER, "");
        String expResult = "DRVR";
        String result = instance.getUniqueIdentifier();
        assertEquals(expResult, result);
    }

}
