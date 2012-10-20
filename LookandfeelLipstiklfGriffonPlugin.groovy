/* --------------------------------------------------------------------
   Lookandfeel Lipstiklf
   Copyright (C) 2011-2012 Andres Almiray

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
class LookandfeelLipstiklfGriffonPlugin {
    // the plugin version
    String version = '1.0.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.0.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [lookandfeel: '1.0.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'GNU General Public License 2'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-lookandfeel-lipstik-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Pluggable Look & Feel based on Lipstik'
    String description = '''
Pluggable Look & Feel based on [Lipstik][1].

Usage
-----

Refer to the [lookandfeel][2] plugin to find out how setup `lookAndFeel` and `theme` properties in the configuration.

LookAndFeel and Themes
----------------------
| *LookAndFeel* | *Theme* |
| ------------- | ------- |
| Lipstik       | Lipstik |

[1]: http://sourceforge.net/projects/lipstiklf/
[2]: /plugin/lookandfeel
'''
}
