/*
 *
 *  * Copyright (c) 2022  Bitshift D.O.O (http://bitshifted.co)
 *  *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 */

package co.bitshifted.appforge.common.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationInfoTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    void testSerializationSuccess() throws Exception{
        ApplicationInfo appInfo = new ApplicationInfo();
        appInfo.setName("appname");
        appInfo.setDescription("description");
        appInfo.setHeadline("headline");

        Path output = Files.createTempFile("appforge-common", "appinfotest");
        mapper.writeValue(output.toFile(), appInfo);
        // check values
        ApplicationInfo compared = mapper.readValue(output.toFile(), ApplicationInfo.class);
        assertEquals(appInfo.getName(), compared.getName());
        assertEquals(appInfo.getDescription(), compared.getDescription());
        assertEquals(appInfo.getHeadline(), compared.getHeadline());
    }
}
