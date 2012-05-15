$(function () {
    // Start the app on jQuery's DOMReady. The app
    // itself is defined in the js/todomvc.js file.
    TodoMVC.start();

    var sock = new SockJS(window.socketport);
    sock.onopen = function () {
        console.log('open');
    };
    sock.onmessage = function (e) {
        console.log('message', e.data);
        alert('received message echoed from server: ' + e.data);
    };
    sock.onclose = function () {
        console.log('close');
    };

    function send(message) {

        if (sock.readyState == WebSocket.OPEN) {
            console.log("sending message")
            sock.send(message);
        } else {
            console.log("The socket is not open.");
        }
    }

    $('#socket-test').click(function (e) {
        send($('#socket-test-msg').val());
    });


});