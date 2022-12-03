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

public enum LinuxPackageType {

    DEB (".deb"),
    RPM (".rpm"),
    TAR_GZ (".tar.gz");

    private String display;

    LinuxPackageType(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }
}
