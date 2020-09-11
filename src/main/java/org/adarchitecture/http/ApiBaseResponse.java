package org.adarchitecture.http;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class ApiBaseResponse implements Serializable {
	public static final String OK_RESPONSE ="success";
	public static final String FAIL_RESPONSE ="failed";

	/**
	 * 
	 */
	private static final long serialVersionUID = 5750204327237137628L;
	private String respStatusCode = OK_RESPONSE;
	private Map<String, String> respStatusMessage = new TreeMap<String, String>();

}
