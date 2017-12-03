
package io.dcloud;
/**
 * 如果需要引入NativeUI.模块需要import io.dcloud.feature.ui.nativeui.NativeUIR;, 并且RInformation类需要implements NativeUIR类

 如果需要引入gallery模块（图片选择）需要import io.dcloud.js.gallery.GalleryR;, 并且RInformation类需要implements GalleryR类
 */

import io.dcloud.feature.ui.nativeui.NativeUIR;
import io.dcloud.js.gallery.GalleryR;

/**
 * 本文件是5+SDK使用的资源索引
 * 工程引入本文件的包名必须是“io.dcloud”
 * */
public class RInformation extends PdrR implements NativeUIR,GalleryR {
	
	public static int VIEW_LAYOUT_SPLASH = 0;
}

