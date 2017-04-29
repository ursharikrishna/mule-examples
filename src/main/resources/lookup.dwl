%dw 1.0
%output application/xml
---
{
	 a: lookup("lookupflow",{b:"Hello"})
}
