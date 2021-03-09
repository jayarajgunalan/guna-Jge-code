package com.vibaps.merged.safetyreport.common;

public final class AppConstants {

	public static final String RESPONSE_SUCCESS = "OK";

	public static final String	COLON				= ":";
	public static final String	SLASH				= "/";
	public static final String	PROTOCOL_SECURE		= "https";
	public static final String	PROTOCOL_NON_SECURE	= "http";
	public static final String  RESULTS_LIMIT="500";
	public static final String PATH_VERSION = "/apiv1";

	public static final String	METHOD_EXECUTE_MULTI_CALL	= "ExecuteMultiCall";
	public static final String	METHOD_GET_REPORT_DATA		= "GetReportData";
	public static final String	METHOD_GET					= "Get";
	public static final String	PARAM_RISK_MANAGEMENT		= "RiskManagement";
	public static final String	PARAM_NONE					= "None";
	public static final String	PARAM_DEVICE				= "Device";
	public static final String	PARAM_SYSTEM_SETTINGS		= "SystemSettings";
	public static final String START_UTC="T01:00:00";
	public static final String END_UTC="T59:59:59";
	public static final String[]	DEFAULT_HEADERS		= {"Vehicle Name", "Group", "Distance"};
}
