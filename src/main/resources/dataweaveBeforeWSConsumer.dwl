%dw 1.0
%output application/xml
%namespace ns0 http://www.webserviceX.NET
---
{
	ns0#GetCitiesByCountry: {

		ns0#CountryName: payload.country

	}
}