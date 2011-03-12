/* --------------------------------------------------------------------
   Lookandfeel Lipstiklf
   Copyright (C) 2011 Andres Almiray

   This library is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public License as
   published by the Free Software Foundation; either version 2 of the
   License, or (at your option) any later version.

   This library is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this library; if not, see <http://www.gnu.org/licenses/>.
   ---------------------------------------------------------------------
*/

/**
 * @author Andres Almiray
 */

// check to see if we already have a LookandfeelLipstiklfGriffonAddon
boolean addonIsSet1
builderConfig.each() { prefix, v ->
    v.each { builder, views ->
        addonIsSet1 = addonIsSet1 || 'LookandfeelLipstiklfGriffonAddon' == builder
    }
}

if (addonIsSet1) {
    println 'Removing LookandfeelLipstiklfGriffonAddon from Builder.groovy'
    builderConfigFile.text = builderConfigFile.text - "root.'LookandfeelLipstiklfGriffonAddon'.addon=true\n"
}