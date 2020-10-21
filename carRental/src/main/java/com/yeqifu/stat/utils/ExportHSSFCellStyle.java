package com.yeqifu.stat.utils;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;

public class ExportHSSFCellStyle {

	/**
	 * 创建基础样式  
	 * 水平和垂直居中
	 */
	public static HSSFCellStyle  createBaseStyle(HSSFWorkbook workbook) {
		HSSFCellStyle style = workbook.createCellStyle();
		//设置水平居中
		style.setAlignment(HorizontalAlignment.CENTER);
		//设置垂直居中
		style.setVerticalAlignment(VerticalAlignment.CENTER);
		return style;
	}
	
	/**
	 * 创建数据表格的头的样式 
	 */
	public static HSSFCellStyle createTableTitleStyle(HSSFWorkbook workbook) {
		HSSFCellStyle style = createBaseStyle(workbook);
		
		//设置字体
		HSSFFont font=workbook.createFont();
		font.setBold(true);//是否加粗
		font.setFontHeightInPoints((short)12); //设置字体大小
		font.setColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());//设置颜色
		font.setFontName("黑体");//设置字体
		style.setFont(font);
		
		return style;
	}
	
	
	/**
	 * 创建小标题样式
	 */
	public static HSSFCellStyle createSubTitleStyle(HSSFWorkbook workbook) {
		HSSFCellStyle style = createBaseStyle(workbook);
		//设置字体
		HSSFFont font=workbook.createFont();
		font.setBold(true);//是否加粗
		font.setFontHeightInPoints((short)12); //设置字体大小
		font.setColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());//设置颜色
		font.setFontName("黑体");//设置字体
		style.setFont(font);
		return style;
	}
	
	
	
	/**
	 * 创建标题样式
	 */
	public static HSSFCellStyle createTitleStyle(HSSFWorkbook workbook) {
		HSSFCellStyle style = createBaseStyle(workbook);
		//设置字体
		HSSFFont font=workbook.createFont();
		font.setBold(true);//是否加粗
		font.setFontHeightInPoints((short)16); //设置字体大小
		font.setColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());//设置颜色
		font.setFontName("黑体");//设置字体
		style.setFont(font);
		return style;
	}
	

}
