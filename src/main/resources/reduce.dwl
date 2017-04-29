%dw 1.0
%output application/xml
---
{
	sum: payload reduce $$ + $  
}