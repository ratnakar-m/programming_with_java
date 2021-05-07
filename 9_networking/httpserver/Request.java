public class SocketHandler {

	public boolean parse() throws IOException {
		String initialLine = in.readLine();
		log(initialLine);
		StringTokenizer tok = new StringTokenizer(initialLine);
		String[] components = new String[3];
		for (int i = 0; i < components.length; i++) {
		  if (tok.hasMoreTokens())  {
			components[i] = tok.nextToken();
		  } else  {
			return false;
		  }
		}

		method = components[0];
		fullUrl = components[1];

		// Consume headers
		while (true)  {
		  String headerLine = in.readLine();
		  log(headerLine);
		  if (headerLine.length() == 0) {
			break;
		  }

		  int separator = headerLine.indexOf(":");
		  if (separator == -1)  {
			return false;
		  }
		  headers.put(headerLine.substring(0, separator),
			headerLine.substring(separator + 1));
		}

		if (components[1].indexOf("?") == -1) {
		  path = components[1];
		} else  {
		  path = components[1].substring(0, components[1].indexOf("?"));
		  parseQueryParameters(components[1].substring(
			components[1].indexOf("?") + 1));
		}

		if ("/".equals(path)) {
		  path = "/index.html";
		}

		return true;
  }
  
  private void parseQueryParameters(String queryString) {
    for (String parameter : queryString.split("&")) {
      int separator = parameter.indexOf('=');
      if (separator > -1) {
        queryParameters.put(parameter.substring(0, separator),
          parameter.substring(separator + 1));
      } else  {
        queryParameters.put(parameter, null);
      }
    }
  }
}