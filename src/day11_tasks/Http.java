package day11_tasks;

public class Http {
    public static void main(String[] args) {
        /*	5. HTTP is the protocol that governs communications between web-servers and web clients.
        Part of the protocol includes a status code returned by the server to tell the browser the
        status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status code:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable
         declare an int variable called StatusCode, write a switch that prints out, on a line by itself,
          the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                    output:
                        ok       */
        int statusCode=503;
        String label;
        switch (statusCode){
            case(200):
                label="OK";
                break;
            case(201):
                label="Created";
                break;
            case(202):
                label="Accepted";
                break;
            case(301):
                label="Moved Permanently";
                break;
            case(303):
                label="See Other";
                break;
            case(304):
                label="Not Modified";
                break;
            case(307):
                label="Temporary Redirect";
                break;
            case(400):
                label="Bad Request";
                break;
            case(401):
                label="Unauthorized";
                break;
            case(403):
                label="Forbidden";
                break;
            case(404):
                label="Not Found";
                break;
            case(410):
                label="Gone";
                break;
            case(500):
                label="Internal Server Error";
                break;
            default:
                label="Service Unavailable";
        }
        System.out.println(label);






















    }
}
