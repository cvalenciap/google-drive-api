
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>GOOGLE DRIVE API</title>
        <link href="lightbox.css" rel="stylesheet" />
        <link href="google-drive.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <!-- Este será el envoltorio transparente utilizado como una pantalla en negro gradiente de luz para mostrar la pantalla está en curso -->
        <div id="transparent-wrapper"></div>

        <!-- Este panel emergente se puede utilizar para mostrar el texto del documento -->
        <div id="login-box" class="hide">
            <p>Please login on your google account.</p>
            <button id="btnLogin" onclick="handleAuthClick(event)" class="button">Login</button>
        </div>

        <div id="drive-box" class="hide">
            <!--  Esta será la navegación de Google Drive -->
            <div id="drive-breadcrumb">
                <span class='breadcrumb-arrow'></span> <a data-id='root' data-level='0'>Home</a>
                <span id="span-navigation"></span>
            </div>

            <!-- Este panel emergente se puede utilizar como panel de información del usuario-->
            <div id="drive-info" class="hide">
                <div class="user-item">Welcome <span id="span-name"></span></div>
                <div class="user-item">Total Quota: <span id="span-totalQuota"></span></div>
                <div class="user-item">Used Quota: <span id="span-usedQuota"></span></div>
                <div class="user-item">Share Mode: <span id="span-sharemode">OFF</span></div>
                <div class="user-item"><a id="link-logout" class="logout-link">Logout</a></div>
            </div>

            <!-- Una lista de menús disponibles para el usuario utilice-->
            <div id="drive-menu">
                <div id="button-reload" title="Refresh"></div>
                <div id="button-upload" title="Upload to Google Drive" class="button-opt"></div>
                <div id="button-addfolder" title="Add Folder" class="button-opt"></div>
                <div id="button-share" title="Show shared files only"></div>
            </div>
            <div id="drive-content"></div>
            <div id="error-message" class="flash hidden"></div>
            <div id="status-message" class="flash hidden"></div>
        </div>

        <!-- Este control de carga se utiliza para subir archivos a Google Drive-->
        <input type="file" id="fUpload" class="hide"/>

        <!-- Este panel emergente se puede utilizar para crear la carpeta-->
        <div class="float-box" id="float-box">
            <div class="folder-form">
                <div class="close-x"><img id="imgClose" class="imgClose" src="images/button_close.png" alt="close" /></div>
                <h3 class="clear">Add New Folder</h3>
                <div><input type="text" id="txtFolder" class="text-input" /></div>
                <button id="btnAddFolder" value="Save" class="button">Add</button>
                <button id="btnClose" value="Close" class="button btnClose">Close</button>
            </div>
        </div>

        <!-- Este panel emergente se puede utilizar para mostrar la información del documento / archivo -->
        <div id="float-box-info" class="float-box">
            <div class="info-form">
                <div class="close-x"><img id="imgCloseInfo" class="imgClose" src="images/button_close.png" alt="close" /></div>
                <h3 class="clear">File information</h3>
                <table cellpadding="0" cellspacing="0" class="tbl-info">
                    <tr>
                        <td class="label">Created Date</td>
                        <td><span id="spanCreatedDate"></span></td>
                    </tr>
                    <tr>
                        <td class="label">Modified Date</td>
                        <td><span id="spanModifiedDate"></span></td>
                    </tr>
                    <tr>
                        <td class="label">Owner</td>
                        <td><span id="spanOwner"></span></td>
                    </tr>
                    <tr>
                        <td class="label">Title</td>
                        <td><span id="spanTitle"></span></td>
                    </tr>
                    <tr>
                        <td class="label">Size</td>
                        <td><span id="spanSize"></span></td>
                    </tr>
                    <tr>
                        <td class="label">Extension</td>
                        <td><span id="spanExtension"></span></td>
                    </tr>
                </table>
                <button id="btnCloseInfo" value="Close" class="button btnClose">Close</button>
            </div>
        </div>

        <!-- Este panel emergente se puede utilizar para mostrar el texto del documento-->
        <div id="float-box-text" class="float-box">
            <div class="info-form">
                <div class="close-x"><img id="imgCloseText" class="imgClose" src="images/button_close.png" alt="close" /></div>
                <h3 class="clear">Text Content</h3>
                <div id="text-content"></div>
                <button id="btnCloseText" value="Close" class="button btnClose">Close</button>
            </div>
        </div>

        <!-- Este marco flotante se utiliza para el cierre de sesión-->
        <iframe id="frameLogout" class="hide"></iframe>
        <script src="js/jquery.min.js"></script>
        <script src="date.js" type="text/javascript"></script>
        <script src="lightbox.min.js" type="text/javascript"></script>
        <script src="google-drive.js"></script>
        <script src="https://apis.google.com/js/client.js?onload=checkAuth"></script>
        <script src="upload.js"></script>
    </body>
</html>
