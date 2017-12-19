//TODO: QR Code wird nicht im Emulator dargestellt!!
//  The encoded username and password
var userDetails;
var studentId;
var loginURL = "https://ase2017-group-2-9.appspot.com/api/student/auth";
var qrURL = "https://ase2017-group-2-9.appspot.com/api/records/qr/";

var app = {
    /*  Initialize the application  */
    initialize: function () {
        //  Hide the QR Code page
        document.getElementById("QrCodePage").style.display = "none";
        this.bindEvents();
    },
    /* Bind events to listeners that are required at startup  */
    bindEvents: function () {
        btnLogin.addEventListener('click', app.Login, false);
    },

    /*  Login to execute any commands */
    Login: function () {
         // Fetch the username and the password from the entered values
        var email = document.getElementById("inEmail").value;
        var password = document.getElementById("inPassword").value;

        //  Update the user details, encode username and password
        app.encodeUserDetails(email, password);

        var loginRequest = app.httpPostLogin();
        studentId = app.getJsonStudentID(loginRequest.responseText);
        if (typeof studentId!="number") {
            document.getElementById("userInfo").innerHTML = "Access denied";
        }
        else {
            app.displayQrCode();
        }
        // 1. Login the user. 2. Receive the student ID if successful, 3. Send getQR, receive QR Code 4. Display it
    },

    /*  HTTP POST request with username and password attached  */
    httpPostLogin: function () {
        //  Open a new HTTP request
        var request = new XMLHttpRequest();
        //  Set it to POST
        request.open("POST", loginURL, false);
        //  Set the header of the attached content to JSON so that the authorization details are being recognized properly
        request.setRequestHeader("Content-Type", "application/json");
        request.setRequestHeader("Authorization", userDetails);
        request.send(null);
        return request;
    },

    displayQrCode: function(){
        //  Hide the Login page
        document.getElementById("LoginPage").style.display = "none";
        //  And instead display the QR code page
        document.getElementById("QrCodePage").style.display = "inline";
        //  Request the specified QR Code for the student's ID
        var qrRequest = app.httpGetQrCode();
        //  Filter the response for the QR Code
        var qrCodeString = app.getQrString(qrRequest.responseText);
        if(qrCodeString == "undefined"){
            document.getElementById("qrcode").innerHTML = qrRequest.responseText;
        }
        else {
            var image = new Image();
            image.width = 350;
            image.height = 350;
            image.style.border='2px solid #000000';
            image.src = "data:image/png;base64," + qrCodeString;
            document.getElementById("qrcode").appendChild(image);
        }

    },

    httpGetQrCode: function(){
        //  Open a new HTTP request
        var request = new XMLHttpRequest();
        //  Set it to POST
        var url = qrURL + studentId
        request.open("GET", url, false);
        //  Set the header of the attached content to JSON so that the authorization details are being recognized properly
        request.setRequestHeader("Content-Type", "application/json");
        request.send(null);
        return request;
    },


    /*  Filter the JSON server response for the student ID  */
    getJsonStudentID: function (responseText) {
        var jsonContent = JSON.parse(responseText);
        return jsonContent.id;
    },

    /*  Filter the JSON server response for the QR code */
    getQrString: function (responseText) {
        var jsonContent = JSON.parse(responseText);
        var qrString = jsonContent.content;
        return qrString;
    },


    /*  Encode the username and password with base64  */
    encodeUserDetails: function (email, password) {
        var token = email + ":" + password;
        //  Encode username and password with base64
        var encoded = btoa(token);

        userDetails = "Basic " + encoded;
    },

};      // end of app
