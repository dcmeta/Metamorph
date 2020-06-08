
var x = document.getElementsByClassName("dateFormater");
var months = {
	    'Jan' : '01',
	    'Feb' : '02',
	    'Mar' : '03',
	    'Apr' : '04',
	    'May' : '05',
	    'Jun' : '06',
	    'Jul' : '07',
	    'Aug' : '08',
	    'Sep' : '09',
	    'Oct' : '10',
	    'Nov' : '11',
	    'Dec' : '12'
	}
for (var i = 0; i < x.length; i++) {
    let val = x[i].getAttribute("value");
    parseDate(val,x[i])
}
function parseDate(date,element){
    //Sun May 31 00:00:00 CST 2020
	var datePart = date.split(' ');
	var month = months[datePart[1]+''];
    var day = parseInt(datePart[2])+1;
    var year = datePart[5];
    var newDate = new Date(year,month-1,day); 
    element.value = year+"-"+month+"-"+day;
    element.valueAsDate = newDate;
}
