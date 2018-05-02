/*
 * Copyright (C) 2018 JReactive <http://www.jreactive.com/>
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.jreactive.commons.util.properties

import java.util.*

class Props(private val fileName: String) {

    private val props = Properties()

    init {
        val ist = javaClass.classLoader.getResourceAsStream(fileName)
        ist.use {
            props.load(ist)
        }
    }

    fun get(key: String): String? {
        return props.getProperty(key)
    }

}