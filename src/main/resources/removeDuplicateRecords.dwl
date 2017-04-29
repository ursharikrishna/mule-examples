%dw 1.0
%output application/json
---
retrievedRecords: payload map (
 {
    id: $.emp_id,
    name: $.name
  }
) distinctBy $