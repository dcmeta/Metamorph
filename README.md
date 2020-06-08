# Metamorph
Framework and tool for developing java web.<br>
<b>You can generate all tables become entity, DAO, controller, and CRUD pages by running 1 command.</b>

Source Code : https://github.com/dcmeta/MetamorphCode<br>
See more detail documentation at : http://18.163.239.181

<h2>Quick Start</h2>
<h5>Preparation</h5>
<ol>
    <li>Open your Eclipse and make your Dynamic Web Project.</li>
    <li>Extract the metamorph bundle to your project directory.</li>
    <li>Extract bundle.zip to your WebContent directory.</li>
    <li>Rename your metamorphGenerator jar become metaGenerator.jar</li>
    <li>Open your command prompt (for Windows user) or terminal (for Linux or Mac user)</li>
    <li>From your terminal, go to your project directory, then run this <b>"java -jar metaGenerator.jar"</b></li>
  <li>The result should be like this <b>"$-"</b>.</li>
  <li>Enter <b>"mg config"</b> command for generating database configuration file.</li>
    <li>The file should be generated on src folder, so go to your src folder and open dbconfig.properties. Then set your database configuration.</li>
    <li>Then you are ready for using it.</li>
</ol>

<h5> Generating Metamorph Components </h5>
<ol>
    <li>Ensure your terminal is already in your project directory.</li>
    <li>Run this command <b>"mg -a"</b></li>
    <li>Then your all of your components should be prepared. You can ensure it by seeing your src folder, in that folder should has <b>dao</b>, <b>entity</b>, <b>controller</b>, and <b>config</b> folder.</li>
</ol>

<h5>Finishing</h5>
<ol>
  <li>Refresh your project folder from eclipse by right clicking your folder, then choose refresh.</li>
  <li>Rebuild your project.</li>
  <li>Run your server.</li>
  <li>Open your browser and run <b>http://localhost:8080/your_project</b>.</li>
</ol>
