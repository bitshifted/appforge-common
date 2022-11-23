/*
 *
 *  * Copyright (c) 2022  Bitshift D.O.O (http://bitshifted.co)
 *  *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 */

package co.bitshifted.appforge.common.util;

import java.util.Comparator;

public class JdkVersionComparator implements Comparator<JdkVersionAware> {

    private static final int PLUS_DIGIT_INDEX = 6;
    private static final int VERSION_DIGITS_LENGTH = 7;

    @Override
    public int compare(JdkVersionAware first, JdkVersionAware second) {
        int[] firstDigits = getJdkVersionDigits(first.getVersion());
        int[] secondDigits = getJdkVersionDigits(second.getVersion());
        for(int i = 0; i < VERSION_DIGITS_LENGTH; i ++) {
            if(firstDigits[i] > secondDigits[i]) {
                return 1;
            } else if (firstDigits[i] < secondDigits[i]){
                return -1;
            }
        }
        return 0;
    }

    private int[] getJdkVersionDigits(String input) {
        int[] jdkVersionDigits = new int[]{0,0,0,0,0,0,0};
        // find number after + sign
        String[] plusSplit = input.split("\\+");
        if(plusSplit.length == 2) {
            jdkVersionDigits[PLUS_DIGIT_INDEX] = Integer.parseInt(plusSplit[1]);
        }
        // split on dot boundary
        String[] dotParts = plusSplit[0].split("\\.");
        for(int i = 0; i < dotParts.length;i++) {
            jdkVersionDigits[i] = Integer.parseInt(dotParts[i]);
        }

        return jdkVersionDigits;
    }
}
